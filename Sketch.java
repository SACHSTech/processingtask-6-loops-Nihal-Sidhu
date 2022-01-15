import processing.core.PApplet;

public class Sketch extends PApplet {
	
	float r;
  float g;
  float b;
  float w;
  float a;
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
    
  }
  
  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0,0,255);
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  
  public void draw() {
    
  // 10x10 Grid Columns
  for (int lineY = (width/2)/10; lineY <= width/2; lineY += (width/2)/10) {
    stroke(0);
    line(lineY, 0, lineY, height/2);
  }
  // 10x10 Grid Rows
  for (int lineX = (height/2)/10; lineX <= height/2; lineX += (height/2)/10) {
    stroke(0);
    line(0, lineX, height/2, lineX);
  }
  // 5x5 Circles
  for (int circleY = height/2/10; circleY <= height/2; circleY += height/2/5) {
    for (int circleX = width/2+25; circleX <= width; circleX += width/2/5) {
      fill(255,255,255);
      ellipse(circleX, circleY, width/80*5, height/80*5);
    }
  }
  // grayscale gradient
  for (int i = 0; i <= width/2; i++) {
    r=i*(19/10);
    g=i*(19/10);
    b=i*(19/10);
    stroke(r,g,b);
    line(i, height/2, i, height);
  }
  // Petals
  
  
  
    
    //ellipse(100+20*cos(b*(PI/4)), 100-20*flowerdiameter*sin(b*PI/4),40,10);
    
    translate (width/4*3,height/4*3);
    for (int b = 0; b <= 3; b++) {
    fill(0,255,0);
    ellipse(0, 0,80,10);
    fill(255,0,0);
    ellipse(0, 0, width/80*5, height/80*5);
    rotate (PI/4);
    
    
    
    
  }
  
  
  /*ellipse(width/4*3,height/4*3,25,25);
  for(int j = 0; j<=3; j++){  
    translate(260-2*j, 265);
    rotate(PI/(float)-3.5);
    ellipse(0,0,width/16,height/4);
  }
  for(int j = 0; j<=5; j++){  
    w+=5;
    translate(100+w, 100+w);
    rotate(PI/(float)-3.0*w/20);
    ellipse(0,0,width/16,height/4);
  }
    w=0;*/
  }
  
  // define other methods down here.
}