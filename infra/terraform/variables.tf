variable "email_service_topic_name" {
  type        = string
  default     = "email_service_topic"
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
