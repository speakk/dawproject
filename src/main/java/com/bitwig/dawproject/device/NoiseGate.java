package com.bitwig.dawproject.device;

import com.bitwig.dawproject.RealParameter;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NoiseGate extends BuiltinDevice
{
   @XmlElement
   public RealParameter threshold;
}
