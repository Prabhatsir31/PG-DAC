#ifndef SIZE_TEMPLATE_H
#define SIZE_TEMPLATE_H

// Function template to calculate total size of three arguments
template <typename T1, typename T2, typename T3>
int totalSize(T1 a, T2 b, T3 c) {
	return sizeof(a) + sizeof(b) + sizeof(c);
}

#endif
