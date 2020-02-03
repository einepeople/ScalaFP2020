package danila.romanov

case class UserBalance(usd:Float, gbp: Float, uah: Float){
  def +(other:UserBalance) = UserBalance(usd+other.usd, gbp+other.gbp, uah+other.uah)
  def -(other:UserBalance) = UserBalance(usd-other.usd, gbp-other.gbp, uah-other.uah)
  def unary_- = UserBalance(-usd,-gbp,-uah)
}

