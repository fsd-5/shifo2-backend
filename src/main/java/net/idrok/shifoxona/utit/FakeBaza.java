package net.idrok.shifoxona.utit;

import com.github.javafaker.Faker;
import net.idrok.shifoxona.entity.Smena;
import net.idrok.shifoxona.service.SmenaService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalTime;

@Component
public class FakeBaza {
    Faker faker = new Faker();

    private  final SmenaService smenaService;

    public FakeBaza(SmenaService smenaService) {
        this.smenaService = smenaService;
    }


    @PostConstruct // dastur ishga tushganda bir marta ishlab ketishi
    public void hammasiniToldirish(){
        smenaTuldirish();

    }



    public void smenaTuldirish(){
        smenaService.create(new Smena(faker.hacker().verb(), LocalTime.of(8, 0), LocalTime.of(15, 0), faker.name().title()));
        smenaService.create(new Smena(faker.hacker().verb(), LocalTime.of(15, 0), LocalTime.of(22, 0), faker.name().title()));
        smenaService.create(new Smena(faker.hacker().verb(), LocalTime.of(22, 0), LocalTime.of(8, 0), faker.name().title()));
    }
}
