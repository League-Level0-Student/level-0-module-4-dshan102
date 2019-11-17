void setup() {
  PImage waldo = loadImage("Waldo.jpg"); // Change this to match your file name.
  size(800, 800);
  image(waldo, 0, 0);
  doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch } 
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
        println("X: " + mouseX + " Y: " + mouseY); 

      // If the mouse is on Waldo, print “Waldo found!”
        if (mouseX>500 && mouseX<530 && mouseY>308 && mouseY<348) {
          println("Waldo Found!");
          playWoohoo();
        }
        else {
          playDoh();
        }

      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
