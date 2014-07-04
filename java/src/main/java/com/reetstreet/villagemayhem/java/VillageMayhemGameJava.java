package com.reetstreet.villagemayhem.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import com.reetstreet.villagemayhem.core.VillageMayhemGame;

public class VillageMayhemGameJava {

  public static void main(String[] args) {
    JavaPlatform.Config config = new JavaPlatform.Config();
    // use config to customize the Java platform, if needed
    JavaPlatform.register(config);
    PlayN.run(new VillageMayhemGame());
  }
}
