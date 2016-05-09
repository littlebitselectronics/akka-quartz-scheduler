package com.typesafe.akka.extension.quartz

import org.quartz.JobExecutionContext

/**
  * Created by johnmcgill on 5/9/16.
  */
case class JobExecution(message: Any, context: JobExecutionContext)