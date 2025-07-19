variable "host" {
  type        = string
  default     = "localhost:9092"
  description = "Kafka connection host"
}

variable "tls" {
  type        = bool
  default     = false
  description = "Kafka tls config value"
}

variable "email_service_topic_name" {
  type        = string
  default     = "email-service-topic"
  description = "Email service topic name"
}

variable "email_service_topic_partitions" {
  type        = number
  default     = 1
  description = "Email service topic partitions value"
}

variable "email_service_topic_replication_factor" {
  type        = number
  default     = 1
  description = "Email service topic replication factor"
}
