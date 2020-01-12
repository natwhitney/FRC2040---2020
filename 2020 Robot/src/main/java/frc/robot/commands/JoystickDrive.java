package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class JoystickDrive extends CommandBase {
    private final Drivetrain m_Drivetrain;
    private double m_forward;
    private double m_rotation;
    private double m_zAxis;
    
    public JoystickDrive(Drivetrain subsytem, double forward, double rotation, double zAxis){
        m_Drivetrain = subsytem;
        addRequirements(m_Drivetrain);
        m_forward = forward;
        m_rotation = rotation;
        m_zAxis = zAxis;
    }

    public void execute(){
        m_Drivetrain.driveDeadband(m_rotation, m_forward, m_zAxis);
    }
}