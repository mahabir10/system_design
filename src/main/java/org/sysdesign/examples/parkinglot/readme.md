Designing Parking Lot Application
________________________________________

Features:
1. It is a **multi-level** parking. User should be able to add to the system new level with different types of parking slots. (This adding situation is very rare. We are also fine with the system being not dynamic)
2. Parking should be able to handle vehicles of **different sizes**. Currently, assume that we have Car, Truck, and Bikes. Keep an room for improvement. At later point new types of vehicles can be added. For ex: Electric vehicle, with charging point
3. It should be able to track the parked and available slots.
4. For now keep the allocation as strict. Which means that a truck should be allocated to the truck slot, electric vehicle is allocated to electric vehicle slot. But keep an room for improvement. At later point of time, the allocator could able to upgrade the allocation or degrade the allocation.
5. In future keep an eye for multiple vehicles per large slot. (Explain how the code will change.)
6. The parking application should be thread safe. Assume that there are multiple entry point and exit points.
7. Keep a room for different implementation of slot allocation in level wise. 