/**
 * This software is released under the University of Illinois/Research and Academic Use License. See
 * the LICENSE file in the root folder for details. Copyright (c) 2016
 *
 * Developed by: The Cognitive Computations Group, University of Illinois at Urbana-Champaign
 * http://cogcomp.cs.illinois.edu/
 */
package edu.illinois.cs.cogcomp.lbjava.infer;

import java.util.Collection;


/**
  * Anonymous inner classes extending this class are instantiated by the code
  * generated by the LBJava compiler when creating
  * <code>FirstOrderConstraint</code> representations.  The methods of this
  * class are used to compute new values for the arguments of a quantified
  * <code>Quantifier</code>.  Only certain value returning methods are
  * overridden.  The others will throw
  * <code>UnsupportedOperationException</code>s.
  *
  * @see    edu.illinois.cs.cogcomp.lbjava.infer.FirstOrderConstraint
  * @see    edu.illinois.cs.cogcomp.lbjava.infer.Quantifier
  * @see    java.lang.UnsupportedOperationException
  * @author Nick Rizzolo
 **/
abstract public class QuantifierArgumentReplacer extends ArgumentReplacer
{
  /**
    * This flag is set if the collection of the quantifier is not quantified.
   **/
  public boolean collectionConstant;
  /**
    * This flag is set if the bound parameter of an
    * <code>AtLeastQuantifier</code> or an <code>AtMostQuantifier</code> is
    * not quantified.
   **/
  public boolean boundConstant;


  /**
    * Initializing constructor.
    *
    * @param c  The context of the corresponding equality, except for
    *           quantification variables.
   **/
  public QuantifierArgumentReplacer(Object[] c) {
    super(c);
    collectionConstant = boundConstant = false;
  }

  /**
    * Use this constructor to indicate which of the two arguments of the
    * equality is in fact not quantified.
    *
    * @param c  The context of the corresponding equality, except for
    *           quantification variables.
    * @param b  Set to <code>false</code> if the unquantified argument is the
    *           collection; set to <code>true</code> if the unquantified
    *           argument is the bound.
   **/
  public QuantifierArgumentReplacer(Object[] c, boolean b) {
    super(c);
    collectionConstant = !b;
    boundConstant = b;
  }


  /**
    * Computes the new collection.  This method needs to be overridden if it
    * is to be called, since by default it simply throws an
    * <code>UnsupportedOperationException</code>.
   **/
  public Collection getCollection() {
    throw new UnsupportedOperationException(
        "LBJ ERROR: getCollection() not supported.");
  }


  /**
    * Computes the new value of the bound.  This method needs to be overridden
    * if it is to be called, since by default it simply throws an
    * <code>UnsupportedOperationException</code>.
   **/
  public int getBound() {
    throw new UnsupportedOperationException(
        "LBJ ERROR: getBound() not supported.");
  }
}

