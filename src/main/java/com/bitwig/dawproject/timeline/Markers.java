package com.bitwig.dawproject.timeline;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Markers extends Timeline
{
   @XmlElementRef(required = true)
   public List<Marker> markers = new ArrayList<>();
}
