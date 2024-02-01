package ex05;

public class ChildSpeaker2 extends Speakerm {

	   public ChildSpeaker2() {
	   }

	   @Override
	   public void powerOn() {
	      System.out.println("전원on.");
	   }
	   
	   @Override
	   public void powerOff() {
	      System.out.println("전원off.");
	   }
	   
	   @Override
	   public void SoundUp() {
	      System.out.println("사운드up.");
	   }
	   
	   @Override
	   public void SoundDown() {
	      System.out.println("사운드down.");
	   }
	   
	}