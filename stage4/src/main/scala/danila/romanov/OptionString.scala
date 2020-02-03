package danila.romanov

sealed trait OptionString {
  // Applies the function `f` to inner value if it exists.
  // Returns OptionString with the new value if called on SomeString,
  // otherwise returns NoneString.
  def map(f: String => String): OptionString

  // Applies the function `f` to inner value.
  // Returns the output of `f` if called on OptionString,
  // otherwise returns NoneString.
  def flatMap(f: String => OptionString): OptionString

  // Applies the function `f` to inner value if it exists
  // Returns itself if the result of `f` is true,
  // otherwise returns NoneString
  def filter(f: String => Boolean): OptionString

  // Fallbacks to `fallback` value if there is no inner value.
  def getOrElse(fallback: String): String
}

final case class SomeString(value: String) extends OptionString {
  // Applies the function `f` to inner value if it exists.
  // Returns OptionString with the new value if called on SomeString,
  // otherwise returns NoneString.
  def map(f: String => String): OptionString = SomeString(f(value))

  // Applies the function `f` to inner value.
  // Returns the output of `f` if called on OptionString,
  // otherwise returns NoneString.
  def flatMap(f: String => OptionString): OptionString = f(value)

  // Applies the function `f` to inner value if it exists
  // Returns itself if the result of `f` is true,
  // otherwise returns NoneString
  def filter(f: String => Boolean): OptionString = if (f(value)) this else NoneString

  // Fallbacks to `fallback` value if there is no inner value.
  def getOrElse(fallback: String): String = value
}

object NoneString extends OptionString {
  override def map(f: String => String): NoneString.type = NoneString
  override def flatMap(f: String => OptionString): NoneString.type = NoneString
  override def filter(f: String => Boolean): NoneString.type = NoneString
  override def getOrElse(fallback: String): String = fallback
}
