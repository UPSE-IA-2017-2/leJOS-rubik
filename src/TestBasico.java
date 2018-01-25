import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class TestBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RegulatedMotor m = new EV3LargeRegulatedMotor(MotorPort.B);

		m.rotate(360);
		m.close();
		
		RegulatedMotor medium = new EV3MediumRegulatedMotor(MotorPort.C);
		medium.rotate(90);
		medium.close();
		cambiarCara();
		//cambiarCara();

	}
	
	public static void cambiarCara()
	{
		RegulatedMotor brazo = new EV3LargeRegulatedMotor(MotorPort.A);
		brazo.rotateTo(90);	
		esperar();
		brazo.rotateTo(-90);
		esperar();
		brazo.rotateTo(90);
			//brazo.rotateTo(-90);
			//brazo.rotateTo(90);
		brazo.close();
	}
	
	public static void rotarCara()
	{
		RegulatedMotor brazo = new EV3LargeRegulatedMotor(MotorPort.A);
		brazo.rotateTo(-90);
			brazo.rotateTo(90);
			brazo.rotateTo(- 0);
		brazo.close();
	}
	
	public static void esperar()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
