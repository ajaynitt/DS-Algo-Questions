//
int i2=2,i3=3,i5=5;

int minm=min(i2,i3,i5);
cout<<minm;

if(minm==i2)
{
  i2+=2;
}
if(minm==i3)
{
  i3+=3;
}

if(minm==i5)
{
  minm+=5;
}

Repeat it n times to get ugly number.

all should be if,not else if because for ugly number 6 ,
i2 and i3 both should update their value to 8 and 8 respectively
