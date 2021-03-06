package com.fernandocejas.java.samples.optional;

import com.fernandocejas.arrow.annotations.See;
import com.fernandocejas.java.samples.Const;
import java.util.ArrayList;
import java.util.List;

@See(ref = "http://fernandocejas.com/2016/02/20/how-to-use-optional-on-android-and-java/")
public class OptionalMenuOption {

  private final List<Object> examples;

  public OptionalMenuOption() {
    examples = new ArrayList<>(3);
    examples.add(new UseCaseScenario01());
    examples.add(new UseCaseScenario02());
    examples.add(new UseCaseScenario03());
  }

  public void run() {
    for (Object object : examples) {
      printMessage("--------- Printing example ---------");
      printMessage(object.toString());
      printMessage(Const.LINE_FEED);
    }
    printMessage("Exiting application...");
    System.exit(0);
  }

  private void printMessage(String message) {
    System.out.println(message);
  }
}
