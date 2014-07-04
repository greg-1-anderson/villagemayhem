package com.reetstreet.villagemayhem.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import com.reetstreet.villagemayhem.core.VillageMayhemGame;

public class VillageMayhemGameActivity extends GameActivity {

  @Override
  public void main(){
    PlayN.run(new VillageMayhemGame());
  }
}
