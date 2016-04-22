/**
 * This software is released under the University of Illinois/Research and Academic Use License. See
 * the LICENSE file in the root folder for details. Copyright (c) 2016
 *
 * Developed by: The Cognitive Computations Group, University of Illinois at Urbana-Champaign
 * http://cogcomp.cs.illinois.edu/
 */
package edu.illinois.cs.cogcomp.lbjava.infer;


/**
  * Anonymous inner classes extending this class are instantiated by the code
  * generated by the LBJava compiler when creating
  * <code>QuantifiedConstraintInvocation</code> representations.  Its lone
  * method computes the value of the constraint invocation's parameter.
  *
  * @author Nick Rizzolo
 **/
abstract public class InvocationArgumentReplacer extends ArgumentReplacer
{
  /**
    * Initializing constructor.
    *
    * @param c  The context of the corresponding quantified constraint
    *           invocation, except for quantification variables.
   **/
  public InvocationArgumentReplacer(Object[] c) { super(c); }


  /**
    * Computes the value of the constraint invocation's parameter.
    *
    * @return The value of the constraint invocation's parameter.
   **/
  abstract public Object compute();
}

