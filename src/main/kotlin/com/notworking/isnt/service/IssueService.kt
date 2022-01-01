package com.notworking.isnt.service

import com.notworking.isnt.model.Issue
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface IssueService {

    fun findAllIssue(): List<Issue>
    
    fun findAllIssue(pageable: Pageable): Page<Issue>

    fun findAllLatestOrder(): List<Issue>

    fun findIssue(id: Long): Issue?

    fun saveIssue(issue: Issue, email: String): Issue

    fun updateIssue(issue: Issue)

    fun deleteIssue(id: Long)
}
