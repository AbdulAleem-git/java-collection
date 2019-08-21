package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClockAngle {
	public static void main(String args[]) throws IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Time");
		String str[] = br.readLine().split(":");
		int hour = Integer.parseInt(str[0]);
		int minut = Integer.parseInt(str[1]);
		if(hour < 0 || minut < 0 || hour >12 || minut>60) {
			System.out.println("wrong input");
			System.exit(1);}
		if(hour == 12 )
				hour = 0 ; 
		if(minut == 60)
				minut = 0 ; 
		
		int hourAngle = (int)(.5*(hour*60 + minut));
		int minutAngle = minut * 6;
		int angle = Math.abs(hourAngle - minutAngle);
		System.out.println(angle > 360 - angle ? 360-angle:angle);
	}

}
