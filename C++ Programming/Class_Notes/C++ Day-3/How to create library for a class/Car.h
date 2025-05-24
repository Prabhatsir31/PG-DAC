class Car
{
private:
	int speed;
	char *name;
	void startEngine();
	void stopEngine();
public:
	Car(const char *);
	void applyBreak();
	void applyClutch();
	void accelerate(int);
	void start();
	void stop();
	~Car();
};
	
