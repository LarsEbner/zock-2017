
public class GeometicObject {
	
Vertex pos;
double width;
double height;

public GeometicObject(Vertex pos, double width, double height){
	this.pos=pos;
	this.width=width;
	this.height=height;
	
	if(width<0){
		width=-width;
		pos.x=pos.x-width;
	}	
	if(height<0){
		height=-height;
		pos.y=pos.y-height;
	}
	
 }

public GeometicObject(double width, double height){
	this(new Vertex(0,0),width, height);
}

public GeometicObject(double width){
	this(width, width);
}

public GeometicObject(){
	this(10);
}

public GeometicObject(Vertex pos){
	this(pos,0,0);	
}

public String toString(){
	return "width="+width+" height="+height+" pos="+pos+"";
}


public double circumference(){
	return 2*(width+height);
}

public double area(){return width*height;
}

public boolean contains(Vertex v){
	return (v.x >= pos.x && v.x <= pos.x +width) &&
			(v.y >= pos.y && v.y <= pos.y +height);
}

public boolean isLargerThan(GeometicObject that){
	return this.area() > that.area();
}

public void moveTo(Vertex v){
	this.pos=v;
}

public void moveTo(double x, double y){
	moveTo(new Vertex(x,y));}
		
public boolean equals(Object thatObject){
	if(thatObject instanceof GeometicObject){
		GeometicObject that = (GeometicObject)thatObject;
	return that.width==this.width &&
			that.height==this.height &&
			that.pos.equals(that.pos);
	}
	return false;
}

}