package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class JoystickDrive extends CommandBase {
    private final Drivetrain m_Drivetrain;

    private static final int kLeftJoystickChannel = 0;
    private Joystick m_LeftStick;

    public JoystickDrive(Drivetrain subsytem){
        m_Drivetrain = subsytem;
        addRequirements(m_Drivetrain);
        m_LeftStick = new Joystick(kLeftJoystickChannel);
    }

    public void execute(){
        m_Drivetrain.driveDeadband(m_LeftStick.getX(), m_LeftStick.getY(), m_LeftStick.getZ());
    }
}