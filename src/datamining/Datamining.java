/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datamining;
import java.util.Scanner;  
/**
 *
 * @author octantyas
 */
public class Datamining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int x1,x2,x3,x4,x5,x6;
      int y1,y2,y3,y4,y5,y6;
      int a1,a2,a3,b1,b2,b3,c1,c2,c3,d1,d2,d3,e1,e2,e3,f1,f2,f3;
      int underweightx = 0, underweighty=0,idealx=0,idealy=0, overweightx=0,overweighty=0;
        int x=0,y=0,z=0,a=0;
        int xp1=37;
        int yp1=148;
        int xp2=52;
        int yp2=155;
        int xp3=80;
        int yp3=157;        
        Scanner input= new Scanner(System.in); 
        System.out.println("---Aplikasi Penghitung Kategori Berat Badan Ideal Berdasarkan K-Means Clustering---");
        System.out.println("Silahkan masukkan Berat badan dan tinggi badan sejumlah 6 orang");
        System.out.print("berat badan dan tiggi badan orang ke-1: \n" );  
        System.out.print("Masukan berat badan orang ke-1: \n" );  
        x1=input.nextInt(); 
        System.out.print("Masukan tinggi badan orang ke-1: \n" );
        y1=input.nextInt(); 
        System.out.print("berat badan dan tiggi badan orang ke-2: \n" ); 
        System.out.print("Masukan berat badan orang ke-2: \n" );
        x2=input.nextInt(); 
        System.out.print("Masukan tinggi badan orang ke-2: \n" );
        y2=input.nextInt(); 
        System.out.print("berat badan dan tiggi badan orang ke-3: \n" ); 
        System.out.print("Masukan berat badan orang ke-3: \n" );
        x3=input.nextInt(); 
        System.out.print("Masukan tinggi badan orang ke-3: \n" );
        y3=input.nextInt(); 
        System.out.print("berat badan dan tiggi badan orang ke-4: \n" ); 
        System.out.print("Masukan berat badan orang ke-4: \n" );
        x4=input.nextInt(); 
        System.out.print("Masukan tinggi badan orang ke-4: \n" );
        y4=input.nextInt(); 
        System.out.print("berat tiggi badan orang ke-5: \n" ); 
        System.out.print("Masukan berat badan orang ke-5: \n" );
        x5=input.nextInt(); 
        System.out.print("Masukan tinggi badan orang ke-5: \n" );
        y5=input.nextInt(); 
        System.out.print("berat badan dan tiggi badan orang ke-6: \n" ); 
        System.out.print("Masukan berat badan orang ke-6: \n" );
        x6=input.nextInt(); 
        System.out.print("Masukan tinggi badan orang ke-6: \n" );
        y6=input.nextInt(); 
        System.out.println(" " ); 
        System.out.println("Perhitungan jarak dari tiap pusat cluster dengan metode Manhattan");
        System.out.println("dengan titik pusat cluster1(37,148)");
        System.out.println("dengan titik pusat cluster2(52,155)");
        System.out.println("dengan titik pusat cluster3(80,157)");
        System.out.println(" " ); 
        a1=Math.abs((x1-xp1)+(y1-yp1));   
        a2=Math.abs((x1-xp2)+(y1-yp2)); 
        a3=Math.abs((x1-xp3)+(y1-yp3)); 
        
        if (a1<a2&&a1<a3)
        { 
          underweightx=underweightx+x1;
          underweighty=underweighty+y1; 
          x=x+1;
          a=a+(a1*a1);
            System.out.println("orang ke-1 termasuk berat underweight dengan jumlah jarak dari titik pusat kluster 1: "+a1);        
              
        }

    else  if (a2<a1&&a2<a3)
        { idealx=idealx+x1;
          idealy=idealy+y1;
          y=y+1;
          a=a+(a2*a2);
            System.out.println("orang ke-1 termasuk berat ideal dengan jumlah jarak dari titik pusat kluster 2: " +a2);
        }
       else  if (a3<a1&&a3<a2)
        { 
          overweightx=overweightx+x1;
          overweighty=overweighty+y1;
          z=z+1;
          a=a+(a3*a3);
            System.out.println("orang ke-1 termasuk berat overweight dengan jumlah jarak dari titik pusat kluster 3: " +a3);    
        }
        System.out.println(" " );
        a1=Math.abs((x2-xp1)+(y2-yp1));   
        a2=Math.abs((x2-xp2)+(y2-yp2)); 
        a3=Math.abs((x2-xp3)+(y2-yp3)); 
        
        if (a1<a2&&a1<a3)
        { 
          underweightx=underweightx+x2;
          underweighty=underweighty+y2; 
          x=x+1;
          a=a+(a1*a1);
            System.out.println("orang ke-2 termasuk berat underweight dengan jumlah jarak dari titik pusat kluster 1: " +a1 );
            
        }
       else  if (a2<a1&&a2<a3)
        { idealx=idealx+x2;
          idealy=idealy+y2;
          y=y+1;
          a=a+(a2*a2);
            System.out.println("orang ke-2 termasuk berat ideal dengan jumlah jarak dari titik pusat kluster 2: " +a2);
        }
       else  if (a3<a1&&a3<a2)
        { 
          overweightx=overweightx+x2;
          overweighty=overweighty+y2;
          z=z+1;
          a=a+(a3*a3);
            System.out.println("orang ke-2 termasuk berat overweight dengan jumlah jarak dari titik pusat kluster 3: " +a3);    
        }
        System.out.println(" " );
        a1=Math.abs((x3-xp1)+(y3-yp1));   
        a2=Math.abs((x3-xp2)+(y3-yp2)); 
        a3=Math.abs((x3-xp3)+(y3-yp3)); 
        
        if (a1<a2&&a1<a3)
        { 
          underweightx=underweightx+x3;
          underweighty=underweighty+y3; 
          x=x+1;
          a=a+(a1*a1);
            System.out.println("orang ke-3 termasuk berat underweight dengan jumlah jarak dari titik pusat kluster 1: " +a1);
            
        }
       else  if (a2<a1&&a2<a3)
        { idealx=idealx+x3;
          idealy=idealy+y3;
          y=y+1;
          a=a+(a2*a2);
            System.out.println("orang ke-3 termasuk berat ideal dengan jumlah jarak dari titik pusat kluster 2: " +a2);
        }
       else  if (a3<a1&&a3<a2)
        { 
          overweightx=overweightx+x3;
          overweighty=overweighty+y3;
          z=z+1;
          a=a+(a3*a3);
            System.out.println("orang ke-3 termasuk berat overweight dengan jumlah jarak dari titik pusat kluster 3: " +a3);    
        }
        System.out.println(" " );
        a1=Math.abs((x4-xp1)+(y4-yp1));   
        a2=Math.abs((x4-xp2)+(y4-yp2)); 
        a3=Math.abs((x4-xp3)+(y4-yp3)); 
         if (a1<a2&&a1<a3)
        { 
          underweightx=underweightx+x4;
          underweighty=underweighty+y4; 
          x=x+1;
          a=a+(a1*a1);
            System.out.println("orang ke-4 termasuk berat underweight dengan jumlah jarak dari titik pusat kluster 1: " +a1);
            
        }
       else  if (a2<a1&&a2<a3)
        { idealx=idealx+x4;
          idealy=idealy+y4;
          y=y+1;
          a=a+(a2*a2);
            System.out.println("orang ke-4 termasuk berat ideal dengan jumlah jarak dari titik pusat kluster 2: " +a2);
        }
       else  if (a3<a1&&a3<a2)
        { 
          overweightx=overweightx+x4;
          overweighty=overweighty+y4;
          z=z+1;
          a=a+(a3*a3);
            System.out.println("orang ke-4 termasuk berat overweightdengan jumlah jarak dari titik pusat kluster 3: " +a3);    
        }
        System.out.println(" " ); 
        a1=Math.abs((x5-xp1)+(y5-yp1));   
        a2=Math.abs((x5-xp2)+(y5-yp2)); 
        a3=Math.abs((x5-xp3)+(y5-yp3)); 
          if (a1<a2&&a1<a3)
        { 
          underweightx=underweightx+x5;
          underweighty=underweighty+y5; 
          x=x+1;
          a=a+(a1*a1);
          System.out.println("orang ke-5 termasuk berat underweight dengan jumlah jarak dari titik pusat kluster 2: " +a1);     
        }
       else  if (a2<a1&&a2<a3)
        { idealx=idealx+x5;
          idealy=idealy+y5;
          y=y+1;
          a=a+(a2*a2);
          System.out.println("orang ke-5 termasuk berat ideal dengan jumlah jarak dari titik pusat kluster 2: " +a2);
        }
       else  if (a3<a1&&a3<a2)
        { 
          overweightx=overweightx+x5;
          overweighty=overweighty+y5;
          z=z+1;
          a=a+(a3*a3);
          System.out.println("orang ke-5 termasuk berat overweight dengan jumlah jarak dari titik pusat kluster 3: " +a3);    
        }
        System.out.println(" " );  
        a1=Math.abs((x6-xp1)+(y6-yp1));   
        a2=Math.abs((x6-xp2)+(y6-yp2)); 
        a3=Math.abs((x6-xp3)+(y6-yp3)); 
         if (a1<a2&&a1<a3)
        { 
          underweightx=underweightx+x6;
          underweighty=underweighty+y6; 
          x=x+1;
          a=a+(a1*a1);
            System.out.println("orang ke-6 termasuk berat underweight dengan jumlah jarak dari titik pusat kluster 1: " +a1);
            
        }
       else  if (a2<a1&&a2<a3)
        { idealx=idealx+x6;
          idealy=idealy+y6;
          y=y+1;
          a=a+(a2*a2);
            System.out.println("orang ke-6 termasuk berat ideal dengan jumlah jarak dari titik pusat kluster 2: " +a2);
        }
       else  if (a3<a1&&a3<a2)
        { 
          overweightx=overweightx+x6;
          overweighty=overweighty+y6;
          z=z+1;
          a=a+(a3*a3);
            System.out.println("orang ke-6 termasuk berat overweight dengan jumlah jarak dari titik pusat kluster 3: " +a3);    
        }
        System.out.println(" " );
        System.out.println("jumlah anggota x cluster 1 (underweight):"+underweightx);
        System.out.println("jumlah anggota y cluster 1 (underweight):"+underweighty);
        System.out.println("jumlah anggota x cluster 2 (ideal):"+idealx);   
        System.out.println("jumlah anggota y cluster 2 (ideal):" +idealy);     
        System.out.println("jumlah anggota y cluster 3 (overweight):"+overweightx);
        System.out.println("jumlah anggota y cluster 3 (overweight):"+overweighty);
        System.out.println("jumlah anggota cluster 1 (underweight):"+x);
        System.out.println("jumlah anggota cluster 2 (ideal):"+y);
        System.out.println("jumlah anggota cluster 3 (overweight):"+z);
        
        int m1a,m1b,m2a,m2b,m3a,m3b,SSE;
        m1a=underweightx/x;
        m1b=underweighty/x;
        m2a=idealx/y;
        m2b=idealy/y;
        m3a=overweightx/z;
        m3b=overweighty/z;
        SSE=a;
          
        System.out.println("x pusat klaster m1 adalah: " +m1a);
        System.out.println("y pusat klaster m1 adalah: " +m1b);
        System.out.println("x pusat klaster m2 adalah: " +m2a);
        System.out.println("y pusat klaster m2 adalah: " +m2b);
        System.out.println("x pusat klaster m3 adalah: " +m3a);
        System.out.println("y pusat klaster m3 adalah: " +m3b);
        System.out.println("jumlah SSE: "+SSE);
        
     
         
       }  
    }  
    
