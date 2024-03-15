package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
//import com.revrobotics.CANSparkBase.IdleMode;
//import com.revrobotics.CANSparkBase.SoftLimitDirection;
import com.revrobotics.CANSparkLowLevel.MotorType;

//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase{
    private CANSparkMax arm;
    private RelativeEncoder m_encoder;
    // public final double kP = 1.0;  this second
    // public final double kI = 0.0;  this fourth
    // public final double kD = 0.0; this third
    // public final double arbFF = 0.0; this first
    //public double setpoint = -1;


    public Arm(){
        arm = new CANSparkMax(6,MotorType.kBrushless);
        m_encoder = arm.getEncoder(); 

        //m_encoder.setPosition(0);
        //m_encoder.setInverted(true);
        //arm.setIdleMode(IdleMode.kBrake);
        //arm.setSmartCurrentLimit(5);
        //arm.enableSoftLimit(SoftLimitDirection.kForward, true);
        //arm.enableSoftLimit(SoftLimitDirection.kReverse, true);
        //arm.setSoftLimit(SoftLimitDirection.kForward, kUpperLimitLeftMotor); 
        //arm.setSoftLimit(SoftLimitDirection.kReverse, kLowerLimitRightMotor);
    }
    public void move(double speed, double position) {
        arm.setInverted(false);
        if(m_encoder.getPosition() > position){
        arm.set(speed);
        }
        else{
        stop();
        }
     }
      public void movedown(double speed, double position) {
        arm.setInverted(true);
        if(m_encoder.getPosition() < 0){
        arm.set(speed);
        }
        else{
            stop();
        }
     }
  
     public void stop() {
        arm.set(0);
     }
}
