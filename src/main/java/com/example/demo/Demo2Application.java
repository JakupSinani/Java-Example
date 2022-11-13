package com.example.demo;

import com.example.demo.models.Stream;
import com.example.demo.models.Viewer;
import com.example.demo.repository.StreamRepository;
import com.example.demo.repository.ViewerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext=
        SpringApplication.run(Demo2Application.class, args);
        StreamRepository streamRepository=configurableApplicationContext.getBean(StreamRepository.class);
        ViewerRepository viewerRepository=configurableApplicationContext.getBean(ViewerRepository.class);

        Viewer johnViewer = new Viewer("John12");
        Viewer willViewer = new Viewer("WillM2");
        Viewer samViewer=new Viewer("MightySam");

        List<Viewer>viewers= Arrays.asList(johnViewer,willViewer,samViewer);

        Stream cookingStream = new Stream("CookingIsAwesome");
        Stream gamingStream = new Stream("ChillGaming");

        List<Stream>streams=Arrays.asList(cookingStream,gamingStream);

        streamRepository.saveAll(streams);

        johnViewer.followStream(cookingStream);
        willViewer.followStream(gamingStream);
        samViewer.followStream(cookingStream);

        viewerRepository.saveAll(viewers);
    }

}
