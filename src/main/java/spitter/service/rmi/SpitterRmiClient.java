package spitter.service.rmi;
import java.util.List;

import my.spitterP.mainP.Spitter;
import my.spitterP.mainP.SpitterService;
import my.spitterP.mainP.Spittle;

import org.springframework.beans.factory.annotation.Autowired;



public class SpitterRmiClient {

  public List<Spittle> getSpittles(String userName) {
    Spitter spitter = spitterService.getSpitter(userName);
    return spitterService.getSpittlesForSpitter(spitter);
  }

  @Autowired
  SpitterService spitterService;

}
