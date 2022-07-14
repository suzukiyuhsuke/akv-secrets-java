package com.keyvault.secrets.quickstart;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws InterruptedException
     * @throws IllegalArgumentException
     */
    @Test
    public void shouldAnswerWithTrue() throws IllegalArgumentException, InterruptedException
    {
        com.keyvault.secrets.quickstart.App.main(null);
        assertTrue( true );
    }
}
