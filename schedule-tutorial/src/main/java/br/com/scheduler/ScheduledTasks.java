package br.com.scheduler;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.model.Item;
import br.com.model.Rss;
import br.com.service.IRssService;

@Component
public class ScheduledTasks {
	private static final String url = "http://www.valor.com.br/brasil/infraestrutura/rss"; 
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    @Autowired
    private IRssService service;

    @Scheduled(cron = "${scheduling.job}")
    public void reportCurrentTime() {
    	RestTemplate restTemplate = new RestTemplate();
    	Rss myRss = restTemplate.getForObject(url, Rss.class);
    	replaceHtmlCodeFromDescription(myRss.getChannel().getItem());
    	if(myRss != null) {
    		service.save(myRss);
    	}
    	log.info(myRss.toString());
    }
    
    private List<Item> replaceHtmlCodeFromDescription(List<Item> items) {
    	for (Item item : items) {
			String description = item.getDescription();			
			item.setDescription(htmlToString(description));			
		}
		return items;    	
    }
    
    private String htmlToString(String html) {
    	return html.replaceAll("\\<[^>]*>","");
    }
}