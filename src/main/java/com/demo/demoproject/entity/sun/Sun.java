package com.demo.demoproject.entity.sun;

public class Sun {

  private static Sun INSTANCE = null;

  private Sun() {
  }

  public static Sun getINSTANCE() {
    if (INSTANCE == null) {
      INSTANCE = new Sun();
    }
    return INSTANCE;
  }
}
