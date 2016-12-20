package com.longnc;

import junit.framework.TestCase;

public class SkeletonTest extends TestCase {
    public void testSay() {
        Skeleton skeleton = new Skeleton();
        assertEquals("I'm alive",skeleton.say());
    }
}
