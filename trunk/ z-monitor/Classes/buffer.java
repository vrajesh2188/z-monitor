/* Z-Monitor: A Monitoring Tool for IEEE 802.15.4 Wireless Personal Area Networks

 * Website: http://www.z-monitor.org
 * Contact: dev@z-monitor.org
 *
 * Copyright (c) 2014
 * Owners: Al-Imam University/CISTER Research Unit/Prince Sultan University
 * All rights reserved.
 *
 * License Type: GNU GPL
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/


package Classes;

/*
 * buffer: is used to store the divided packets into vector. Any class wants to
 * use these frames read it from these class.
 */

import Classes.Packet.*;
import Classes.Support.ICMPStruct;
import java.util.Vector;

public interface buffer {

      public void AddPackets(IEEE802_15_4 packet); //add the packet to the vector
      public void AddPackets(sixLoWPAN packet);
      public void AddPackets(ICMPStruct packet);
      public void AddOrigonalPackets(String packet);
      public void AddOrigonalTimes(double time);
      //public Vector<IEEE802_15_4> getPackets(); //return the vector (packets)
      public Vector<IEEE802_15_4> IEEE802_15_4getPackets();
      public Vector<sixLoWPAN> sixLoWPANgetPackets();
      public Vector<ICMPStruct> ICMPgetPackets();
      public Vector<String> getOrigonalPackets();
      public Vector<Double> getOrigonalTimes();

}
