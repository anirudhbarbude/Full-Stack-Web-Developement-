public  Class Addition {

   public void add (int x,int y)  {

System.out.println(x+4);

}

public void add ( int x, int y ,int z) {

System.out.println(x+y+z);
}

public void add  (int x,int y,double z,String operation) {

System.out.print(operation+(x+y+z));

}

public static void main ()  {

Addition ad=new Addition() {

ad.add(10.20);
ad.add(q0,20,30);
ad.add(10,20,30,300,"Addition");

}
}

