// devpro.cpp : Defines the functions for the static library.
//

#include "pch.h"

#include "Car.h"

Car::Car(const char* ptr)
{
	name = new char[strlen(ptr) + 1];
	speed = 0;
}
void Car::startEngine()
{
	cout << "Engine started" << endl;
}
void Car::stopEngine()
{
	cout << "Engine stopped" << endl;
}
void Car::applyBreak()
{
	cout << "break applied" << endl;
}
void Car::applyClutch()
{
	cout << "clutch applied" << endl;
}
void Car::accelerate(int speed)
{
	this->speed = speed;
}
void Car::start()
{
	startEngine();
	cout << "Car started" << endl;
}
void Car::stop()
{
	stopEngine();
	cout << "Car Stopped" << endl;
}
Car::~Car()
{
	delete[]name;
}
 
