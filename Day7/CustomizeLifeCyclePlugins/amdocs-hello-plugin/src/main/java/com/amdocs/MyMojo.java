package com.amdocs;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo; 
import org.apache.maven.plugins.annotations.LifecyclePhase;
@Mojo( name = "hello", defaultPhase = LifecyclePhase.PROCESS_SOURCES )
/*
 *Goal prints Hello message
 *
 */
public class MyMojo
    extends AbstractMojo
{
    public void execute()
        throws MojoExecutionException
    {	
	System.out.println("Amdocs Hello Custom Plugin");
	}
}
