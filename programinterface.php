<?php
interface MyInterfaceName
{
 public function area($radius,$height);
 public function volume();
 
}
define("PI",3.14);
class cylinder implements MyInterfaceName
{
	
	$radius;
	$height;
	public function area($radius,$height)
	{
		$this->radius = $radius;
		$this->height = $height;
		$area = 2*PI*$this->radius*$this->height+2*PI*$this->radius*$this->radius;
		echo "area of cylinder is".$area;
	}
	
}
$obj = new cylinder;
$obj->area(5,10);
?>