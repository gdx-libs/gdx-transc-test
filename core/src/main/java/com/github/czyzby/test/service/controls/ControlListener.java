package com.github.czyzby.test.service.controls;

/** Listens to game events. */
public interface ControlListener {
    /** Invoked when controller detects jump input event. */
    void jump();
}