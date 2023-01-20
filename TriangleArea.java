public class TriangleArea {

    public void area(int edge1,int edge2,int edge3){


        int u=(edge1+edge2+edge3)/2;
        int peremeter=2*u;
        int triangleareadsquare=u*(u-edge1)*(u-edge2)*(u-edge3);


        System.out.println(Math.sqrt(triangleareadsquare));

    }
}
