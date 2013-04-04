package com.atlassian.maven.plugins.jgitflow.manager;

import java.util.List;

import com.atlassian.maven.plugins.jgitflow.ReleaseContext;
import com.atlassian.maven.plugins.jgitflow.exception.JGitFlowReleaseException;

import org.apache.maven.project.MavenProject;

/**
 * @since version
 */
public interface FlowReleaseManager
{
    void start(ReleaseContext ctx, List<MavenProject> reactorProjects) throws JGitFlowReleaseException;
}