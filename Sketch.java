import processing.core.PApplet;


/**
A program Sketch.java that spawns a castle in a random location.  If it is on the left side, the castle is blue.  If it ison the right side, the castle is red.
@author: T. Chu
*/





public class Sketch extends PApplet {

  public void settings() {

    size(1920,1080);
  }
  
  
  
 
  public void setup() {

  
    background(82, 148, 255);

    castleX = random(0,width);
    castleY = random(0,height);

    currentTime = hour() + ":" + minute() + ":" + second();

  }

  // Setting sizes and variables
  float castleX;
  float castleY;
  

  float towerSize = 100;

  float towerDistance = towerSize / 2;

  String currentTime;

  

  public void draw() {

  
    // Change castle color based on its position
    if (castleX > width / 2 || castleX == width / 2 ) {
      fill(255, 0, 0); // Red castle if it's on the right half
    } else {
      fill(0, 0, 255); // Blue castle if it's on the left half
    }
  
    // Main Castle
    rect(castleX, castleY, towerSize, towerSize);
  
    // Change tower color based on its position
    if (castleX - towerDistance > width / 2 || castleX == width / 2 ) {
      fill(255, 0, 0); // Red tower if it's on the right half
    } else {
      fill(0, 0, 255); // Blue tower if it's on the left half
    }
  
    // Towers
    rect(castleX - towerDistance, castleY - towerDistance, towerSize - towerDistance, towerSize + towerDistance);
    rect(castleX + towerDistance + towerDistance, castleY - towerDistance, towerSize - towerDistance, towerSize + towerDistance);

    // Displays the time
    fill(255); 
    textSize(32); 
    text("Current time: " + currentTime, 50, 50); 
    
  }
  
}