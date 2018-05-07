package edu.holycross.shot.aldt


/** A single token in a [[Sentence]].
*
* @param urn CtsUrn for the token.
* @param txt Textual content of the token.
* @param headToken  ALDT head
* @param relation  String serialization of relation of token to head.
*/
class SyntaxToken(val urn: String, val txt: String, val headToken: String, relation: String) {

  // 4 cols in csv: id, text deformation, head token, relation

}
