import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class TestBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//rotarCara();
		
		//scanear();
		//cambiarCara();
		//cambiarCara();
		
		/*
		cambiarCara();
		cambiarCara();
		cambiarCara();
		cambiarCara();
		cambiarCara();
		*/
		
		rotarCara();
		cambiarCara();
		cambiarCara();
		rotarCara();
		rotarCara();
		cambiarCara();
		rotarCara();
		rotarCara();
		cambiarCara();
		cambiarCara();
		cambiarCara();
		rotarCara();
	}

	public static void scanear() {
		RegulatedMotor medium = new EV3MediumRegulatedMotor(MotorPort.C);
		medium.rotate(90);
		medium.close();
	}
	
	public static void cambiarCara()
	{
		RegulatedMotor brazo = new EV3LargeRegulatedMotor(MotorPort.A);
		brazo.rotateTo(65);	
		esperar();
		brazo.rotateTo(-20);
		esperar();
		brazo.rotateTo(4);
		Sound.beep();
		//esperar();
		
		
		//esperar();
		//brazo.rotateTo(90);
			//brazo.rotateTo(-90);
			//brazo.rotateTo(90);
		brazo.close();
	}
	
	public static void rotarCara()
	{
		RegulatedMotor baseRotatoria = new EV3LargeRegulatedMotor(MotorPort.B);

		//baseRotatoria.rotate(267);
		baseRotatoria.rotate(344);
		baseRotatoria.rotate(-78);
		Sound.beep();
		//esperar();
		//baseRotatoria.rotate(-180);
		baseRotatoria.close();
	}
	
	public static void esperar()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
