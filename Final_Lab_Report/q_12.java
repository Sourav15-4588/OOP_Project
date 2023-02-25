/*
12. Write a class called ColourChecking. Define a color with red = 193, green =255 and blue
= 183. No separate the rgb values. Find the Hue, saturation and brightness of this color.
Formula is available here
https://manifold.net/doc/mfd8/colors_as_hue_saturation_and_brightness.htm
*/

import java.lang.*;
public class ColourChecking {
    int red=193;
    int green=255;
    int blue=183;
    public static void main(String[] args){
        ColourChecking ob = new ColourChecking();
        int hue, brightness, saturation;
        if(ob.red==ob.green && ob.red==ob.blue && ob.blue==ob.green){
            hue=0;
        }
        else hue=100;

        int m1=(ob.red+ob.green+Math.abs(ob.red-ob.green))/2;
        int M=(m1+ob.blue+Math.abs(m1 - ob.blue))/2;
        int m2 = (ob.red + ob.green - Math.abs(ob.red-ob.green))/2;
        int m = (m2 + ob.blue-Math.abs(m2 - ob.blue))/2;
         brightness=(M+m)/2;
        if(ob.red==ob.green && ob.green==ob.blue && ob.red==ob.blue){
            saturation=0;
        }
        else {
            if(brightness<128){
                saturation=255*(M-m)/(M+m);
            }
            else saturation=255*(M-m)/(511-(M+m));
        }
        System.out.println("Hue is "+hue);
        System.out.println("Brightness is "+brightness);
        System.out.println("Saturation is "+saturation);
    }
}
