Program Functionalities and Features (Specifications)
• checkBag
Add a bag into the conveyer belt.
– VIP bags should be placed before regular bags. That is, VIP bags should be placed
at the head (beginning) of the conveyor belt (with the most recently added VIP
bag placed as the last VIP bag, just before the first regular bag).
– Other bags should be placed at the end of the conveyor belt
• printSummary
Print a summary of the bags on the conveyor belt. Print the total number of bags,
the number of VIP bags, and the total weight of all the bags.
• printDetails
Print the summary as above, plus a list of all of the bags, one per line, displaying the
flight number, weight, size, and VIP status for each.
• loadFlight
Remove all of the bags with the given flight number (simulating loading the bags onto
a plane). That is, search the list for bags with the given flight number and remove
them from the list. Print a statement indicating the number of bags loaded onto the
flight.
• removeOverSize
Bags over a certain size are too big to fit on a passenger plane and must be sent as
cargo. Remove all bags over the given size (num, a double) from the list. Print a
statement indicating the number of bags removed.
