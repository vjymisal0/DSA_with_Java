// Node class to represent a patient
class Patient {
    String name;
    int severity;
    Patient next;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
        this.next = null;
    }
}

class PatientPriorityQueue {
    private Patient front;

    public PatientPriorityQueue() {
        this.front = null;
    }

    // Enqueue (insert) a patient with priority
    public void enqueue(String name, int severity) {
        Patient newPatient = new Patient(name, severity);

        // If the queue is empty or new patient has higher priority
        if (front == null || severity > front.severity) {
            newPatient.next = front; // Insert the new patient at the front
            front = newPatient; // Update the front
        } else {
            Patient temp = front; // Temporary variable to traverse the queue
            // Traverse the queue to find the correct position
            while (temp.next != null && severity <= temp.next.severity) {
                temp = temp.next; // Move to the next patient
            }
            // Insert the new patient
            newPatient.next = temp.next;    // Update the next of the new patient
            temp.next = newPatient; // Update the next of the previous patient
        }
        System.out.println("Patient " + name + " with severity " + severity + " added to the queue.");
    }

    // Dequeue (remove) the patient with the highest priority
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No patient to dequeue.");
        } else {
            System.out.println("Patient " + front.name + " with severity " + front.severity + " dequeued.");
            front = front.next;
        }
    }

    // Display the patients in the queue
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Patients in the queue:");
            Patient temp = front;
            while (temp != null) {
                System.out.println("Name: " + temp.name + ", Severity: " + temp.severity);
                temp = temp.next;
            }
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }
}

// Main class to test the priority queue
public class Practical12 {
    public static void main(String[] args) {
        PatientPriorityQueue priorityQueue = new PatientPriorityQueue();

        // Enqueue patients with different priorities
        priorityQueue.enqueue("Alice", 3);
        priorityQueue.enqueue("Bob", 5);
        priorityQueue.enqueue("Charlie", 2);
        priorityQueue.enqueue("David", 4);

        // Display the queue
        priorityQueue.displayQueue();

        // Dequeue patients
        priorityQueue.dequeue();
        priorityQueue.dequeue();

        // Display the updated queue
        priorityQueue.displayQueue();
    }
}
