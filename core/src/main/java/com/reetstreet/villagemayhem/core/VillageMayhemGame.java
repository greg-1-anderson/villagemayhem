package com.reetstreet.villagemayhem.core;

import static playn.core.PlayN.*;

import playn.core.Game;
import playn.core.Image;
import playn.core.ImageLayer;
import playn.core.GroupLayer;
import playn.core.util.Clock;

import react.UnitSlot;

import tripleplay.ui.Background;
import tripleplay.ui.Button;
import tripleplay.ui.Group;
import tripleplay.ui.Interface;
import tripleplay.ui.Label;
import tripleplay.ui.Root;
import tripleplay.ui.SimpleStyles;
import tripleplay.ui.Style;
import tripleplay.ui.layout.AxisLayout;

public class VillageMayhemGame extends Game.Default {

  private GroupLayer controlLayer = null;
  private Interface iface = null;
  
  private Group labels = null;
  private Group buttons = null;
  
  private int gold = 0;
    
  public VillageMayhemGame() {
    super(33); // call update every 33ms (30 times per second)
  }

  @Override
  public void init() {
    // create and add background image layer
    //Image bgImage = assets().getImage("images/bg.png");
    //ImageLayer bgLayer = graphics().createImageLayer(bgImage);
    //graphics().rootLayer().add(bgLayer);
    
    controlLayer = graphics().createGroupLayer();
    graphics().rootLayer().add(controlLayer);

    // create our UI manager and configure it to process pointer events
    iface = new Interface();

    // create our demo interface
    Root root = iface.createRoot(AxisLayout.vertical().gap(15), SimpleStyles.newSheet());
    root.setSize(graphics().width(), graphics().height());
    root.addStyles(Style.BACKGROUND.is(Background.solid(0xFF99CCFF).inset(5)));
    controlLayer.add(root.layer);

    root.add(labels = new Group(AxisLayout.vertical().offStretch()),
        buttons = new Group(AxisLayout.vertical().offStretch()));

    Button button = new Button("Clink!");
    button.clicked().connect(new UnitSlot() {
        @Override
        public void onEmit() {
          giveGold(1);
        }
      });
    buttons.add(button);
    this.updateLabels();
  }
  
  private void giveGold(int amount) {
    this.gold += amount;
    this.updateLabels();
  }
  
  private void updateLabels() {
    labels.destroyAll();
    labels.add(new Label("Gold: " + this.gold));
  }

  @Override
  public void update(int delta) {
    _clock.update(delta);
    if (iface != null) {
      iface.update(delta);
    }
  }

  @Override
  public void paint(float alpha) {
    _clock.paint(alpha);
    if (iface != null) {
      iface.paint(_clock);
    }
  }
  protected final Clock.Source _clock = new Clock.Source(0x21);
}
