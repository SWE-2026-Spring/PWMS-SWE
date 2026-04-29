package Application;

import Presentation.*;

public class driver
{
   static public void main(String[] args)
   {
      new java.io.File("ACS.dat").delete();

      AccessControlList cf = AccessControlList.Instance();

      cf.addUser("Bill", "password", SubsystemEnums.DAS, SubsystemRoles.DATAANALYST);
      cf.addUser("Joe",  "JoePass",  SubsystemEnums.DGS, SubsystemRoles.DATAGATHERER);
      cf.addUser("Mary", "MaryPass", SubsystemEnums.AAS, SubsystemRoles.AUDITOR);
      cf.addUser("Amy",  "AmyPass",  SubsystemEnums.AAS, SubsystemRoles.WATCHMAN);

      cf.dump();
   }
}
