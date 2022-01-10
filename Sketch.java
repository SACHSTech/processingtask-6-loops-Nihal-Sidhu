import processing.core.PApplet;

public class Sketch extends PApplet {
	
	float r;
  float g;
  float b;
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
    background(255,0,0);
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
  translate(width/2, height/2);
  for (int j = 0; j <= 7; j++) {
    System.out.println(PI/(float)3.0);
    rotate(PI/(float)3.0);
    //ellipse(width/40*25+(j*100),height/4*3,width/4,height/16);
    //ellipse(width/40*25,height/4*3,width/4,height/16);
    ellipse(250,250,50,70);
    
  }
  
  //for (int a = 0; a <= 1; a++) {
   // ellipse(width/4*3,height/40*25+(a*100),width/16,height/4);
  //}
  ellipse(width/4*3,height/4*3,25,25);

  }
  
  // define other methods down here.
}