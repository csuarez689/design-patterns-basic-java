/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dessignpatternsexamples.structural.bridge;

/**
 *
 * @author Claudio
 */
public interface IDevice {

    public boolean isEnabled();

    public void enable();

    public void disable();

    public int getVolume();

    public void setVolume(int volume);

    public int getChannel();

    public void setChannel(int channel);

    public void printStatus();
}
