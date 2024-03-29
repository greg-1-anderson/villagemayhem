package com.reetstreet.villagemayhem.html;

import playn.core.PlayN;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;

import com.reetstreet.villagemayhem.core.VillageMayhemGame;

public class VillageMayhemGameHtml extends HtmlGame {

  @Override
  public void start() {
    HtmlPlatform.Config config = new HtmlPlatform.Config();
    // use config to customize the HTML platform, if needed
    HtmlPlatform platform = HtmlPlatform.register(config);
    platform.assets().setPathPrefix("villagemayhem/");
    PlayN.run(new VillageMayhemGame());
  }
}
