package br.com.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.model.Rss;
import br.com.service.IRssService;

@Component
public class ScheduledTasks {
	private static final String url = "http://www.valor.com.br/brasil/infraestrutura/rss"; 
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
    @Autowired
    private IRssService service;

    @Scheduled(cron = "${scheduling.job}")
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    	RestTemplate restTemplate = new RestTemplate();
    	Rss myRss = restTemplate.getForObject(url, Rss.class);
    	if(myRss != null) {
    		service.save(myRss);
    	}
    	log.info(myRss.toString());
    }
}