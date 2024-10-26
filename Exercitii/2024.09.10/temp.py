import numpy as np
import matplotlib.pyplot as plt

# Define time variable
t = np.linspace(0, 10, 100)

# Linear acceleration
a_linear = t  # Linear acceleration (a(t) = t)

# Quadratic velocity (integration of linear acceleration)
v_quadratic = (1/2) * t**2

# Exponential velocity (for comparison, if acceleration were exponential)
a_exponential = np.exp(0.3 * t)  # Exponential acceleration (not linear, but to show the comparison)
v_exponential = np.exp(0.3 * t)

# Plot linear acceleration vs. quadratic velocity
plt.figure(figsize=(10, 6))

# Plot linear acceleration
plt.subplot(2, 1, 1)
plt.plot(t, a_linear, label='Linear Acceleration (a(t) = t)', color='blue')
plt.title('Linear Acceleration and Corresponding Velocity')
plt.xlabel('Time (s)')
plt.ylabel('Acceleration (m/s²)')
plt.grid(True)
plt.legend()

# Plot quadratic velocity
plt.subplot(2, 1, 2)
plt.plot(t, v_quadratic, label='Quadratic Velocity (v(t) = 0.5t²)', color='red')
plt.xlabel('Time (s)')
plt.ylabel('Velocity (m/s)')
plt.grid(True)
plt.legend()

plt.tight_layout()
plt.show()
